package paasta.delivery.pipeline.api.job.template;

import org.apache.commons.io.FileUtils;
import paasta.delivery.pipeline.api.common.Constants;
import paasta.delivery.pipeline.api.job.CustomJob;

import java.io.File;
import java.io.IOException;

/**
 * paastaDeliveryPipelineApi
 * paasta.delivery.pipeline.api.jobTemplate
 *
 * @author REX
 * @version 1.0
 * @since 6 /27/2017
 */
class DeployJobTemplate {

    /**
     * Gets deploy template for java.
     *
     * @param customJob the custom job
     * @return the deploy template for java
     * @throws IOException the io exception
     */
    String getDeployJobTemplateForJava(CustomJob customJob) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File templateFile;
        String loadedJobTemplate;

        // CHECK USE YN OF USER SCRIPT
        if (Constants.USE_YN_N.equals(customJob.getManifestUseYn())) {
            // CASE DEFAULT
            templateFile = new File(classLoader.getResource("job-template/deploy-job-java-default.xml").getFile());
        } else {
            // CASE USER MANIFEST.YML SCRIPT
            templateFile = new File(classLoader.getResource("job-template/deploy-job-java-user-script.xml").getFile());
        }

        loadedJobTemplate = setCommonDeployJobTemplateForJava(FileUtils.readFileToString(templateFile, "UTF-8"), customJob);

        return loadedJobTemplate;
    }


    private String setCommonDeployJobTemplateForJava(String loadedDeployJobTemplate, CustomJob customJob) {
        String resultJobTemplate;
        String consoleTextBegin = "echo \"";
        String consoleTextEnd = "\" >> manifest.yml\n";
        String manifestScript = "";

        // CASE USER MANIFEST.YML SCRIPT
        if (Constants.USE_YN_Y.equals(customJob.getManifestUseYn())) {
            StringBuilder bld = new StringBuilder();

            for (String line : customJob.getManifestScript().split("\\n")) {
                bld.append(consoleTextBegin).append(line).append(consoleTextEnd);
            }

            manifestScript = bld.toString();
        }

        resultJobTemplate = loadedDeployJobTemplate.replace("@MANIFEST_TEXT", manifestScript);

        return resultJobTemplate;
    }

}
