/*
 * playit.gg's api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: unstable
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package gg.playit.api;

import gg.playit.ApiException;
import gg.playit.api.models.AgentsRoutingGetPost200Response;
import gg.playit.api.models.AgentsRoutingGetPost400Response;
import gg.playit.api.models.AgentsRundataPost200Response;
import gg.playit.api.models.ClaimAcceptPost200Response;
import gg.playit.api.models.ClaimAcceptPost400Response;
import gg.playit.api.models.ClaimDetailsPost200Response;
import gg.playit.api.models.ClaimDetailsPost400Response;
import gg.playit.api.models.ClaimExchangePost200Response;
import gg.playit.api.models.ClaimExchangePost400Response;
import gg.playit.api.models.ClaimRejectPost400Response;
import gg.playit.api.models.ClaimSetupPost200Response;
import gg.playit.api.models.ClaimSetupPost400Response;
import gg.playit.api.models.LoginGuestPost200Response;
import gg.playit.api.models.ProtoRegisterPost200Response;
import gg.playit.api.models.ReqAgentsRoutingGet;
import gg.playit.api.models.ReqClaimAccept;
import gg.playit.api.models.ReqClaimDetails;
import gg.playit.api.models.ReqClaimExchange;
import gg.playit.api.models.ReqClaimReject;
import gg.playit.api.models.ReqClaimSetup;
import gg.playit.api.models.ReqProtoRegister;
import gg.playit.api.models.ReqTunnelsCreate;
import gg.playit.api.models.ReqTunnelsDelete;
import gg.playit.api.models.ReqTunnelsList;
import gg.playit.api.models.TunnelsCreatePost200Response;
import gg.playit.api.models.TunnelsCreatePost400Response;
import gg.playit.api.models.TunnelsCreatePost401Response;
import gg.playit.api.models.TunnelsCreatePost500Response;
import gg.playit.api.models.TunnelsDeletePost200Response;
import gg.playit.api.models.TunnelsDeletePost400Response;
import gg.playit.api.models.TunnelsListPost200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultPlayitAPI
 */
@Disabled
public class DefaultPlayitAPITest {

    private final DefaultPlayitAPI api = new DefaultPlayitAPI();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void agentsRoutingGetPostTest() throws ApiException {
        ReqAgentsRoutingGet reqAgentsRoutingGet = null;
        AgentsRoutingGetPost200Response response = api.agentsRoutingGetPost(reqAgentsRoutingGet);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void agentsRundataPostTest() throws ApiException {
        AgentsRundataPost200Response response = api.agentsRundataPost();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void claimAcceptPostTest() throws ApiException {
        ReqClaimAccept reqClaimAccept = null;
        ClaimAcceptPost200Response response = api.claimAcceptPost(reqClaimAccept);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void claimDetailsPostTest() throws ApiException {
        ReqClaimDetails reqClaimDetails = null;
        ClaimDetailsPost200Response response = api.claimDetailsPost(reqClaimDetails);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void claimExchangePostTest() throws ApiException {
        ReqClaimExchange reqClaimExchange = null;
        ClaimExchangePost200Response response = api.claimExchangePost(reqClaimExchange);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void claimRejectPostTest() throws ApiException {
        ReqClaimReject reqClaimReject = null;
        TunnelsDeletePost200Response response = api.claimRejectPost(reqClaimReject);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void claimSetupPostTest() throws ApiException {
        ReqClaimSetup reqClaimSetup = null;
        ClaimSetupPost200Response response = api.claimSetupPost(reqClaimSetup);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginGuestPostTest() throws ApiException {
        LoginGuestPost200Response response = api.loginGuestPost();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void protoRegisterPostTest() throws ApiException {
        ReqProtoRegister reqProtoRegister = null;
        ProtoRegisterPost200Response response = api.protoRegisterPost(reqProtoRegister);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tunnelsCreatePostTest() throws ApiException {
        ReqTunnelsCreate reqTunnelsCreate = null;
        TunnelsCreatePost200Response response = api.tunnelsCreatePost(reqTunnelsCreate);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tunnelsDeletePostTest() throws ApiException {
        ReqTunnelsDelete reqTunnelsDelete = null;
        TunnelsDeletePost200Response response = api.tunnelsDeletePost(reqTunnelsDelete);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tunnelsListPostTest() throws ApiException {
        ReqTunnelsList reqTunnelsList = null;
        TunnelsListPost200Response response = api.tunnelsListPost(reqTunnelsList);
        // TODO: test validations
    }

}
