# DefaultPlayitAPI

All URIs are relative to *https://api.playit.gg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agentsRoutingGetPost**](DefaultPlayitAPI.md#agentsRoutingGetPost) | **POST** /agents/routing/get |  |
| [**agentsRundataPost**](DefaultPlayitAPI.md#agentsRundataPost) | **POST** /agents/rundata |  |
| [**claimAcceptPost**](DefaultPlayitAPI.md#claimAcceptPost) | **POST** /claim/accept |  |
| [**claimDetailsPost**](DefaultPlayitAPI.md#claimDetailsPost) | **POST** /claim/details |  |
| [**claimExchangePost**](DefaultPlayitAPI.md#claimExchangePost) | **POST** /claim/exchange |  |
| [**claimRejectPost**](DefaultPlayitAPI.md#claimRejectPost) | **POST** /claim/reject |  |
| [**claimSetupPost**](DefaultPlayitAPI.md#claimSetupPost) | **POST** /claim/setup |  |
| [**loginGuestPost**](DefaultPlayitAPI.md#loginGuestPost) | **POST** /login/guest |  |
| [**protoRegisterPost**](DefaultPlayitAPI.md#protoRegisterPost) | **POST** /proto/register |  |
| [**tunnelsCreatePost**](DefaultPlayitAPI.md#tunnelsCreatePost) | **POST** /tunnels/create |  |
| [**tunnelsDeletePost**](DefaultPlayitAPI.md#tunnelsDeletePost) | **POST** /tunnels/delete |  |
| [**tunnelsListPost**](DefaultPlayitAPI.md#tunnelsListPost) | **POST** /tunnels/list |  |


<a id="agentsRoutingGetPost"></a>
# **agentsRoutingGetPost**
> AgentsRoutingGetPost200Response agentsRoutingGetPost(reqAgentsRoutingGet)



### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqAgentsRoutingGet** | [**ReqAgentsRoutingGet**](ReqAgentsRoutingGet.md)|  | |

### Return type

[**AgentsRoutingGetPost200Response**](AgentsRoutingGetPost200Response.md)

### Authorization

[AgentKey](../README.md#AgentKey), [ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="agentsRundataPost"></a>
# **agentsRundataPost**
> AgentsRundataPost200Response agentsRundataPost()



### Example
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

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    try {
      AgentsRundataPost200Response result = apiInstance.agentsRundataPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#agentsRundataPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AgentsRundataPost200Response**](AgentsRundataPost200Response.md)

### Authorization

[AgentKey](../README.md#AgentKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="claimAcceptPost"></a>
# **claimAcceptPost**
> ClaimAcceptPost200Response claimAcceptPost(reqClaimAccept)



### Example
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
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    ReqClaimAccept reqClaimAccept = new ReqClaimAccept(); // ReqClaimAccept | 
    try {
      ClaimAcceptPost200Response result = apiInstance.claimAcceptPost(reqClaimAccept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#claimAcceptPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqClaimAccept** | [**ReqClaimAccept**](ReqClaimAccept.md)|  | |

### Return type

[**ClaimAcceptPost200Response**](ClaimAcceptPost200Response.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="claimDetailsPost"></a>
# **claimDetailsPost**
> ClaimDetailsPost200Response claimDetailsPost(reqClaimDetails)



### Example
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
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    ReqClaimDetails reqClaimDetails = new ReqClaimDetails(); // ReqClaimDetails | 
    try {
      ClaimDetailsPost200Response result = apiInstance.claimDetailsPost(reqClaimDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#claimDetailsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqClaimDetails** | [**ReqClaimDetails**](ReqClaimDetails.md)|  | |

### Return type

[**ClaimDetailsPost200Response**](ClaimDetailsPost200Response.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="claimExchangePost"></a>
# **claimExchangePost**
> ClaimExchangePost200Response claimExchangePost(reqClaimExchange)



### Example
```java
// Import classes:
import gg.playit.ApiClient;
import gg.playit.ApiException;
import gg.playit.Configuration;
import gg.playit.models.*;
import gg.playit.api.DefaultPlayitAPI;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.playit.gg");

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    ReqClaimExchange reqClaimExchange = new ReqClaimExchange(); // ReqClaimExchange | 
    try {
      ClaimExchangePost200Response result = apiInstance.claimExchangePost(reqClaimExchange);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#claimExchangePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqClaimExchange** | [**ReqClaimExchange**](ReqClaimExchange.md)|  | |

### Return type

[**ClaimExchangePost200Response**](ClaimExchangePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="claimRejectPost"></a>
# **claimRejectPost**
> TunnelsDeletePost200Response claimRejectPost(reqClaimReject)



### Example
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
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    ReqClaimReject reqClaimReject = new ReqClaimReject(); // ReqClaimReject | 
    try {
      TunnelsDeletePost200Response result = apiInstance.claimRejectPost(reqClaimReject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#claimRejectPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqClaimReject** | [**ReqClaimReject**](ReqClaimReject.md)|  | |

### Return type

[**TunnelsDeletePost200Response**](TunnelsDeletePost200Response.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="claimSetupPost"></a>
# **claimSetupPost**
> ClaimSetupPost200Response claimSetupPost(reqClaimSetup)



### Example
```java
// Import classes:
import gg.playit.ApiClient;
import gg.playit.ApiException;
import gg.playit.Configuration;
import gg.playit.models.*;
import gg.playit.api.DefaultPlayitAPI;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.playit.gg");

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    ReqClaimSetup reqClaimSetup = new ReqClaimSetup(); // ReqClaimSetup | 
    try {
      ClaimSetupPost200Response result = apiInstance.claimSetupPost(reqClaimSetup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#claimSetupPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqClaimSetup** | [**ReqClaimSetup**](ReqClaimSetup.md)|  | |

### Return type

[**ClaimSetupPost200Response**](ClaimSetupPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="loginGuestPost"></a>
# **loginGuestPost**
> LoginGuestPost200Response loginGuestPost()



### Example
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

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    try {
      LoginGuestPost200Response result = apiInstance.loginGuestPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#loginGuestPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginGuestPost200Response**](LoginGuestPost200Response.md)

### Authorization

[AgentKey](../README.md#AgentKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="protoRegisterPost"></a>
# **protoRegisterPost**
> ProtoRegisterPost200Response protoRegisterPost(reqProtoRegister)



### Example
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

    DefaultPlayitAPI apiInstance = new DefaultPlayitAPI(defaultClient);
    ReqProtoRegister reqProtoRegister = new ReqProtoRegister(); // ReqProtoRegister | 
    try {
      ProtoRegisterPost200Response result = apiInstance.protoRegisterPost(reqProtoRegister);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#protoRegisterPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqProtoRegister** | [**ReqProtoRegister**](ReqProtoRegister.md)|  | |

### Return type

[**ProtoRegisterPost200Response**](ProtoRegisterPost200Response.md)

### Authorization

[AgentKey](../README.md#AgentKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="tunnelsCreatePost"></a>
# **tunnelsCreatePost**
> TunnelsCreatePost200Response tunnelsCreatePost(reqTunnelsCreate)



### Example
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
    ReqTunnelsCreate reqTunnelsCreate = new ReqTunnelsCreate(); // ReqTunnelsCreate | 
    try {
      TunnelsCreatePost200Response result = apiInstance.tunnelsCreatePost(reqTunnelsCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#tunnelsCreatePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqTunnelsCreate** | [**ReqTunnelsCreate**](ReqTunnelsCreate.md)|  | |

### Return type

[**TunnelsCreatePost200Response**](TunnelsCreatePost200Response.md)

### Authorization

[AgentKey](../README.md#AgentKey), [ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="tunnelsDeletePost"></a>
# **tunnelsDeletePost**
> TunnelsDeletePost200Response tunnelsDeletePost(reqTunnelsDelete)



### Example
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
    ReqTunnelsDelete reqTunnelsDelete = new ReqTunnelsDelete(); // ReqTunnelsDelete | 
    try {
      TunnelsDeletePost200Response result = apiInstance.tunnelsDeletePost(reqTunnelsDelete);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#tunnelsDeletePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqTunnelsDelete** | [**ReqTunnelsDelete**](ReqTunnelsDelete.md)|  | |

### Return type

[**TunnelsDeletePost200Response**](TunnelsDeletePost200Response.md)

### Authorization

[AgentKey](../README.md#AgentKey), [ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a id="tunnelsListPost"></a>
# **tunnelsListPost**
> TunnelsListPost200Response tunnelsListPost(reqTunnelsList)



### Example
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
    ReqTunnelsList reqTunnelsList = new ReqTunnelsList(); // ReqTunnelsList | 
    try {
      TunnelsListPost200Response result = apiInstance.tunnelsListPost(reqTunnelsList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultPlayitAPI#tunnelsListPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reqTunnelsList** | [**ReqTunnelsList**](ReqTunnelsList.md)|  | |

### Return type

[**TunnelsListPost200Response**](TunnelsListPost200Response.md)

### Authorization

[AgentKey](../README.md#AgentKey), [ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

