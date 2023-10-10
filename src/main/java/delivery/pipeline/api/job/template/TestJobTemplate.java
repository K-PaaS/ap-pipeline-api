package delivery.pipeline.api.job.template;

import delivery.pipeline.api.job.CustomJob;

import java.io.IOException;

/**
 * apDeliveryPipelineApi
 * delivery.pipeline.api.job.template
 *
 * @author REX
 * @version 1.0
 * @since 8 /22/2017
 */
class TestJobTemplate extends JobCommonTemplate {

    /**
     * Gets test job template for java.
     *
     * @param customJob the custom job
     * @return the test job template for java
     * @throws IOException the io exception
     */
    String getTestJobTemplateForJava(CustomJob customJob) throws IOException {
        String loadedJobTemplate = getCommonTemplateForBuildTestJobForJava(customJob);

        // FOR SVN REPOSITORY
        loadedJobTemplate = loadedJobTemplate.replace("@SVN_USER_NAME", customJob.getRepositoryAccountId());
        loadedJobTemplate = loadedJobTemplate.replace("@SVN_USER_PASSWORD", customJob.getRepositoryAccountPassword());

        loadedJobTemplate = loadedJobTemplate.replace("@INSPECTION_PROJECT_NAME", customJob.getInspectionProjectName());
        loadedJobTemplate = loadedJobTemplate.replace("@INSPECTION_PROJECT_KEY", customJob.getInspectionProjectKey());

        return loadedJobTemplate;
    }

    String getTestJobTemplateForCommand(CustomJob customJob) throws IOException {
        String loadedJobTemplate = getCommonTemplateForBuildTestJobForCommand(customJob);

        // FOR SVN REPOSITORY
        loadedJobTemplate = loadedJobTemplate.replace("@SVN_USER_NAME", customJob.getRepositoryAccountId());
        loadedJobTemplate = loadedJobTemplate.replace("@SVN_USER_PASSWORD", customJob.getRepositoryAccountPassword());

        loadedJobTemplate = loadedJobTemplate.replace("@INSPECTION_PROJECT_NAME", customJob.getInspectionProjectName());
        loadedJobTemplate = loadedJobTemplate.replace("@INSPECTION_PROJECT_KEY", customJob.getInspectionProjectKey());
        loadedJobTemplate = loadedJobTemplate.replace("@COMMAND_TEXT", customJob.getManifestScript());

        return loadedJobTemplate;
    }

}
