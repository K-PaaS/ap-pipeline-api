package delivery.pipeline.api.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * apDeliveryPipelineApi
 * delivery.pipeline.api.common
 *
 * @author REX
 * @version 1.0
 * @since 6 /15/2017
 */
@Service
public class PropertyService {

    // CI SERVER INFO
    @Value("${ci.server.admin.username}")
    private String ciServerAdminUserName;

    @Value("${ci.server.admin.password}")
    private String ciServerAdminPassword;

    // CI SERVER SSH INFO
    @Value("${ci.server.ssh.username}")
    private String ciServerSshUserName;

    @Value("${ci.server.ssh.password}")
    private String ciServerSshPassword;

    @Value("${ci.server.ssh.port}")
    private String ciServerSshPort;

    @Value("${ci.server.ssh.identity}")
    private String ciServerSshIdentity;

    // CI SERVER CREDENTIAL INFO
    @Value("${ci.server.credentials.url}")
    private String ciServerCredentialsUrl;

    @Value("${ci.server.credentials.scope}")
    private String ciServerCredentialsScope;

    @Value("${ci.server.credentials.className}")
    private String ciServerCredentialsClassName;

    @Value("${ci.server.workspace.path}")
    private String ciServerWorkspacePath;

    // COMMON API
    @Value("${commonApi.url}")
    private String commonApiUrl;

    @Value("${commonApi.authorization.id}")
    private String commonApiAuthorizationId;

    @Value("${commonApi.authorization.password}")
    private String commonApiAuthorizationPassword;

    // INSPECTION API
    @Value("${inspectionApi.url}")
    private String inspectionApiUrl;

    @Value("${inspectionApi.authorization.id}")
    private String inspectionApiAuthorizationId;

    @Value("${inspectionApi.authorization.password}")
    private String inspectionApiAuthorizationPassword;

    //  BINARY STORAGE API
    @Value("${binaryStorageApi.url}")
    private String binaryStorageApiUrl;

    @Value("${binaryStorageApi.authorization.id}")
    private String binaryStorageApiAuthorizationId;

    @Value("${binaryStorageApi.authorization.password}")
    private String binaryStorageApiAuthorizationPassword;


    /**
     * Gets ci server admin user name.
     *
     * @return the ci server admin user name
     */
    public String getCiServerAdminUserName() {
        return Constants.CI_SERVER_ADMIN_USER_NAME;
    }


    /**
     * Gets ci server admin password.
     *
     * @return the ci server admin password
     */
    public String getCiServerAdminPassword() {
        return Constants.CI_SERVER_ADMIN_SECRET;
    }


    /**
     * Gets ci server ssh user name.
     *
     * @return the ci server ssh user name
     */
    public String getCiServerSshUserName() {
        return ciServerSshUserName;
    }


    /**
     * Gets ci server ssh password.
     *
     * @return the ci server ssh password
     */
    public String getCiServerSshPassword() {
        return ciServerSshPassword;
    }


    /**
     * Gets ci server ssh port.
     *
     * @return the ci server ssh port
     */
    public String getCiServerSshPort() {
        return ciServerSshPort;
    }


    /**
     * Gets ci server ssh identity.
     *
     * @return the ci server ssh identity
     */
    public String getCiServerSshIdentity() {
        return ciServerSshIdentity;
    }


    /**
     * Gets ci server credentials url.
     *
     * @return the ci server credentials url
     */
    public String getCiServerCredentialsUrl() {
        return ciServerCredentialsUrl;
    }


    /**
     * Gets ci server credentials scope.
     *
     * @return the ci server credentials scope
     */
    public String getCiServerCredentialsScope() {
        return ciServerCredentialsScope;
    }


    /**
     * Gets ci server credentials class name.
     *
     * @return the ci server credentials class name
     */
    public String getCiServerCredentialsClassName() {
        return ciServerCredentialsClassName;
    }


    /**
     * Gets ci server workspace path.
     *
     * @return the ci server workspace path
     */
    public String getCiServerWorkspacePath() {
        return ciServerWorkspacePath;
    }


    /**
     * Gets common api url.
     *
     * @return the common api url
     */
    String getCommonApiUrl() {
        return commonApiUrl;
    }


    /**
     * Gets common api authorization id.
     *
     * @return the common api authorization id
     */
    String getCommonApiAuthorizationId() {
        return commonApiAuthorizationId;
    }


    /**
     * Gets common api authorization password.
     *
     * @return the common api authorization password
     */
    String getCommonApiAuthorizationPassword() {
        return commonApiAuthorizationPassword;
    }


    /**
     * Gets inspection api url.
     *
     * @return the inspection api url
     */
    public String getInspectionApiUrl() {
        return inspectionApiUrl;
    }


    /**
     * Gets inspection api authorization id.
     *
     * @return the inspection api authorization id
     */
    public String getInspectionApiAuthorizationId() {
        return inspectionApiAuthorizationId;
    }


    /**
     * Gets inspection api authorization password.
     *
     * @return the inspection api authorization password
     */
    public String getInspectionApiAuthorizationPassword() {
        return inspectionApiAuthorizationPassword;
    }


    /**
     * Gets binary storage api url.
     *
     * @return the binary storage api url
     */
    String getBinaryStorageApiUrl() {
        return binaryStorageApiUrl;
    }


    /**
     * Gets binary storage api authorization id.
     *
     * @return the binary storage api authorization id
     */
    String getBinaryStorageApiAuthorizationId() {
        return binaryStorageApiAuthorizationId;
    }


    /**
     * Gets binary storage api authorization password.
     *
     * @return the binary storage api authorization password
     */
    String getBinaryStorageApiAuthorizationPassword() {
        return binaryStorageApiAuthorizationPassword;
    }


}
