# playit-api-java

playit.gg&#39;s api
- API version: unstable

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>playit-api-java</artifactId>
  <version>unstable</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'playit-api-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'playit-api-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:playit-api-java:unstable"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/playit-api-java-unstable.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import gg.playit.ApiClient;
import gg.playit.ApiException;
import gg.playit.Configuration;
import gg.playit.auth.*;
import gg.playit.models.*;
import gg.playit.api.DefaultPlayitAPI;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.playit.gg");
    
    // Configure API key authorization: AgentKey
    ApiKeyAuth AgentKey = (ApiKeyAuth) defaultClient.getAuthentication("AgentKey");
    AgentKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AgentKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    ReqAgentsRoutingGet reqAgentsRoutingGet = new ReqAgentsRoutingGet(); // ReqAgentsRoutingGet | 
    try {
      AgentsRoutingGetPost200Response result = apiInstance.agentsRoutingGetPost(reqAgentsRoutingGet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#agentsRoutingGetPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.playit.gg*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultPlayitAPI* | [**agentsRoutingGetPost**](docs/DefaultPlayitAPI.md#agentsRoutingGetPost) | **POST** /agents/routing/get | 
*DefaultPlayitAPI* | [**agentsRundataPost**](docs/DefaultPlayitAPI.md#agentsRundataPost) | **POST** /agents/rundata | 
*DefaultPlayitAPI* | [**claimAcceptPost**](docs/DefaultPlayitAPI.md#claimAcceptPost) | **POST** /claim/accept | 
*DefaultPlayitAPI* | [**claimDetailsPost**](docs/DefaultPlayitAPI.md#claimDetailsPost) | **POST** /claim/details | 
*DefaultPlayitAPI* | [**claimExchangePost**](docs/DefaultPlayitAPI.md#claimExchangePost) | **POST** /claim/exchange | 
*DefaultPlayitAPI* | [**claimRejectPost**](docs/DefaultPlayitAPI.md#claimRejectPost) | **POST** /claim/reject | 
*DefaultPlayitAPI* | [**claimSetupPost**](docs/DefaultPlayitAPI.md#claimSetupPost) | **POST** /claim/setup | 
*DefaultPlayitAPI* | [**loginGuestPost**](docs/DefaultPlayitAPI.md#loginGuestPost) | **POST** /login/guest | 
*DefaultPlayitAPI* | [**protoRegisterPost**](docs/DefaultPlayitAPI.md#protoRegisterPost) | **POST** /proto/register | 
*DefaultPlayitAPI* | [**tunnelsCreatePost**](docs/DefaultPlayitAPI.md#tunnelsCreatePost) | **POST** /tunnels/create | 
*DefaultPlayitAPI* | [**tunnelsDeletePost**](docs/DefaultPlayitAPI.md#tunnelsDeletePost) | **POST** /tunnels/delete | 
*DefaultPlayitAPI* | [**tunnelsListPost**](docs/DefaultPlayitAPI.md#tunnelsListPost) | **POST** /tunnels/list | 


## Documentation for Models

 - [AccountStatus](docs/AccountStatus.md)
 - [AccountTunnel](docs/AccountTunnel.md)
 - [AccountTunnelAllocation](docs/AccountTunnelAllocation.md)
 - [AccountTunnelAllocationOneOf](docs/AccountTunnelAllocationOneOf.md)
 - [AccountTunnelAllocationOneOf1](docs/AccountTunnelAllocationOneOf1.md)
 - [AccountTunnels](docs/AccountTunnels.md)
 - [AgentAccepted](docs/AgentAccepted.md)
 - [AgentAccountStatus](docs/AgentAccountStatus.md)
 - [AgentClaimDetails](docs/AgentClaimDetails.md)
 - [AgentPendingTunnel](docs/AgentPendingTunnel.md)
 - [AgentRouting](docs/AgentRouting.md)
 - [AgentRoutingGetError](docs/AgentRoutingGetError.md)
 - [AgentRunData](docs/AgentRunData.md)
 - [AgentSecretKey](docs/AgentSecretKey.md)
 - [AgentTunnel](docs/AgentTunnel.md)
 - [AgentTunnelDisabled](docs/AgentTunnelDisabled.md)
 - [AgentType](docs/AgentType.md)
 - [AgentVersion](docs/AgentVersion.md)
 - [AgentsRoutingGetPost200Response](docs/AgentsRoutingGetPost200Response.md)
 - [AgentsRoutingGetPost400Response](docs/AgentsRoutingGetPost400Response.md)
 - [AgentsRoutingGetPost400ResponseOneOf](docs/AgentsRoutingGetPost400ResponseOneOf.md)
 - [AgentsRundataPost200Response](docs/AgentsRundataPost200Response.md)
 - [AllocatedPorts](docs/AllocatedPorts.md)
 - [AllocationRegion](docs/AllocationRegion.md)
 - [AssignedAgent](docs/AssignedAgent.md)
 - [AssignedAgentCreate](docs/AssignedAgentCreate.md)
 - [AssignedDefault](docs/AssignedDefault.md)
 - [AssignedDefaultCreate](docs/AssignedDefaultCreate.md)
 - [AssignedManaged](docs/AssignedManaged.md)
 - [AssignedManagedCreate](docs/AssignedManagedCreate.md)
 - [AuthError](docs/AuthError.md)
 - [ClaimAcceptError](docs/ClaimAcceptError.md)
 - [ClaimAcceptPost200Response](docs/ClaimAcceptPost200Response.md)
 - [ClaimAcceptPost400Response](docs/ClaimAcceptPost400Response.md)
 - [ClaimAcceptPost400ResponseOneOf](docs/ClaimAcceptPost400ResponseOneOf.md)
 - [ClaimDetailsError](docs/ClaimDetailsError.md)
 - [ClaimDetailsPost200Response](docs/ClaimDetailsPost200Response.md)
 - [ClaimDetailsPost400Response](docs/ClaimDetailsPost400Response.md)
 - [ClaimDetailsPost400ResponseOneOf](docs/ClaimDetailsPost400ResponseOneOf.md)
 - [ClaimExchangeError](docs/ClaimExchangeError.md)
 - [ClaimExchangePost200Response](docs/ClaimExchangePost200Response.md)
 - [ClaimExchangePost400Response](docs/ClaimExchangePost400Response.md)
 - [ClaimExchangePost400ResponseOneOf](docs/ClaimExchangePost400ResponseOneOf.md)
 - [ClaimRejectError](docs/ClaimRejectError.md)
 - [ClaimRejectPost400Response](docs/ClaimRejectPost400Response.md)
 - [ClaimRejectPost400ResponseOneOf](docs/ClaimRejectPost400ResponseOneOf.md)
 - [ClaimSetupError](docs/ClaimSetupError.md)
 - [ClaimSetupPost200Response](docs/ClaimSetupPost200Response.md)
 - [ClaimSetupPost400Response](docs/ClaimSetupPost400Response.md)
 - [ClaimSetupPost400ResponseOneOf](docs/ClaimSetupPost400ResponseOneOf.md)
 - [ClaimSetupResponse](docs/ClaimSetupResponse.md)
 - [DeleteError](docs/DeleteError.md)
 - [GuestLoginError](docs/GuestLoginError.md)
 - [IpType](docs/IpType.md)
 - [LoginGuestPost200Response](docs/LoginGuestPost200Response.md)
 - [ObjectId](docs/ObjectId.md)
 - [Platform](docs/Platform.md)
 - [PlayitAgentVersion](docs/PlayitAgentVersion.md)
 - [PortRange](docs/PortRange.md)
 - [PortType](docs/PortType.md)
 - [ProtoRegisterPost200Response](docs/ProtoRegisterPost200Response.md)
 - [Ratelimit](docs/Ratelimit.md)
 - [ReqAgentsRoutingGet](docs/ReqAgentsRoutingGet.md)
 - [ReqClaimAccept](docs/ReqClaimAccept.md)
 - [ReqClaimDetails](docs/ReqClaimDetails.md)
 - [ReqClaimExchange](docs/ReqClaimExchange.md)
 - [ReqClaimReject](docs/ReqClaimReject.md)
 - [ReqClaimSetup](docs/ReqClaimSetup.md)
 - [ReqProtoRegister](docs/ReqProtoRegister.md)
 - [ReqTunnelsCreate](docs/ReqTunnelsCreate.md)
 - [ReqTunnelsDelete](docs/ReqTunnelsDelete.md)
 - [ReqTunnelsList](docs/ReqTunnelsList.md)
 - [SignedAgentKey](docs/SignedAgentKey.md)
 - [SignedEpoch](docs/SignedEpoch.md)
 - [SubscriptionId](docs/SubscriptionId.md)
 - [TotpStatus](docs/TotpStatus.md)
 - [TotpStatusOneOf](docs/TotpStatusOneOf.md)
 - [TunnelAllocated](docs/TunnelAllocated.md)
 - [TunnelAssignment](docs/TunnelAssignment.md)
 - [TunnelAssignmentOneOf](docs/TunnelAssignmentOneOf.md)
 - [TunnelAssignmentOneOf1](docs/TunnelAssignmentOneOf1.md)
 - [TunnelCreateError](docs/TunnelCreateError.md)
 - [TunnelCreateUseAllocation](docs/TunnelCreateUseAllocation.md)
 - [TunnelCreateUseAllocationOneOf](docs/TunnelCreateUseAllocationOneOf.md)
 - [TunnelCreateUseAllocationOneOf1](docs/TunnelCreateUseAllocationOneOf1.md)
 - [TunnelCreateUseAllocationOneOf2](docs/TunnelCreateUseAllocationOneOf2.md)
 - [TunnelDedicatedIp](docs/TunnelDedicatedIp.md)
 - [TunnelDisabled](docs/TunnelDisabled.md)
 - [TunnelDisabledReason](docs/TunnelDisabledReason.md)
 - [TunnelDomain](docs/TunnelDomain.md)
 - [TunnelDomainSource](docs/TunnelDomainSource.md)
 - [TunnelExpireNotice](docs/TunnelExpireNotice.md)
 - [TunnelOrigin](docs/TunnelOrigin.md)
 - [TunnelOriginCreate](docs/TunnelOriginCreate.md)
 - [TunnelOriginCreateOneOf](docs/TunnelOriginCreateOneOf.md)
 - [TunnelOriginCreateOneOf1](docs/TunnelOriginCreateOneOf1.md)
 - [TunnelOriginCreateOneOf2](docs/TunnelOriginCreateOneOf2.md)
 - [TunnelOriginOneOf](docs/TunnelOriginOneOf.md)
 - [TunnelOriginOneOf1](docs/TunnelOriginOneOf1.md)
 - [TunnelOriginOneOf2](docs/TunnelOriginOneOf2.md)
 - [TunnelType](docs/TunnelType.md)
 - [TunnelsCreatePost200Response](docs/TunnelsCreatePost200Response.md)
 - [TunnelsCreatePost400Response](docs/TunnelsCreatePost400Response.md)
 - [TunnelsCreatePost400ResponseOneOf](docs/TunnelsCreatePost400ResponseOneOf.md)
 - [TunnelsCreatePost400ResponseOneOf1](docs/TunnelsCreatePost400ResponseOneOf1.md)
 - [TunnelsCreatePost400ResponseOneOfData](docs/TunnelsCreatePost400ResponseOneOfData.md)
 - [TunnelsCreatePost401Response](docs/TunnelsCreatePost401Response.md)
 - [TunnelsCreatePost401ResponseData](docs/TunnelsCreatePost401ResponseData.md)
 - [TunnelsCreatePost500Response](docs/TunnelsCreatePost500Response.md)
 - [TunnelsCreatePost500ResponseData](docs/TunnelsCreatePost500ResponseData.md)
 - [TunnelsDeletePost200Response](docs/TunnelsDeletePost200Response.md)
 - [TunnelsDeletePost400Response](docs/TunnelsDeletePost400Response.md)
 - [TunnelsListPost200Response](docs/TunnelsListPost200Response.md)
 - [UseAllocDedicatedIp](docs/UseAllocDedicatedIp.md)
 - [UseAllocPortAlloc](docs/UseAllocPortAlloc.md)
 - [UseRegion](docs/UseRegion.md)
 - [WebAuth](docs/WebAuth.md)
 - [WebSession](docs/WebSession.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKey"></a>
### ApiKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="AgentKey"></a>
### AgentKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



