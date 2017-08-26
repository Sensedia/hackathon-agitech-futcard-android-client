# EventsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/futebolcard/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvent**](EventsApi.md#getEvent) | **GET** events/{eventId} | 
[**getSectors**](EventsApi.md#getSectors) | **GET** events/{eventId}/sectors | 
[**getSector**](EventsApi.md#getSector) | **GET** events/{eventId}/sectors/{sectorId} | 
[**getSubsectors**](EventsApi.md#getSubsectors) | **GET** events/{eventId}/sectors/{sectorId}/subsectors | 
[**getSubsector**](EventsApi.md#getSubsector) | **GET** events/{eventId}/sectors/{sectorId}/subsectors/{subsectorId} | 
[**getEvents**](EventsApi.md#getEvents) | **GET** events | 


<a name="getEvent"></a>
# **getEvent**
> Events getEvent(clientId, accessToken, eventId)



Returns the details for a specific occurring event.

### Example
```java
// Import classes:
//import com.sensedia.futebolcard.api.v1.client.ApiException;
//import com.sensedia.futebolcard.api.v1.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
try {
    Events result = apiInstance.getEvent(clientId, accessToken, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |

### Return type

[**Events**](Events.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSectors"></a>
# **getSectors**
> Sectors getSectors(clientId, accessToken, eventId)



Returns a list of sector for the given event.

### Example
```java
// Import classes:
//import com.sensedia.futebolcard.api.v1.client.ApiException;
//import com.sensedia.futebolcard.api.v1.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
try {
    Sectors result = apiInstance.getSectors(clientId, accessToken, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getSectors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |

### Return type

[**Sectors**](Sectors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSector"></a>
# **getSector**
> SubSectors getSector(clientId, accessToken, eventId, sectorId)



Returns the details of a specific sector.

### Example
```java
// Import classes:
//import com.sensedia.futebolcard.api.v1.client.ApiException;
//import com.sensedia.futebolcard.api.v1.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
String sectorId = "sectorId_example"; // String | Sector to search.
try {
    SubSectors result = apiInstance.getSector(clientId, accessToken, eventId, sectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getSector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |
 **sectorId** | **String**| Sector to search. |

### Return type

[**SubSectors**](SubSectors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSubsectors"></a>
# **getSubsectors**
> SubSectors getSubsectors(clientId, accessToken, eventId, sectorId)



Returns a list of subcsectors for a given sector.

### Example
```java
// Import classes:
//import com.sensedia.futebolcard.api.v1.client.ApiException;
//import com.sensedia.futebolcard.api.v1.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
String sectorId = "sectorId_example"; // String | Sector to search.
try {
    SubSectors result = apiInstance.getSubsectors(clientId, accessToken, eventId, sectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getSubsectors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |
 **sectorId** | **String**| Sector to search. |

### Return type

[**SubSectors**](SubSectors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSubsector"></a>
# **getSubsector**
> List&lt;Row&gt; getSubsector(clientId, accessToken, eventId, sectorId, subsectorId)



Returns a list of seat&#39;s information for each row of a given subsector.

### Example
```java
// Import classes:
//import com.sensedia.futebolcard.api.v1.client.ApiException;
//import com.sensedia.futebolcard.api.v1.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventId = "eventId_example"; // String | Event to search.
String sectorId = "sectorId_example"; // String | Sector to search.
String subsectorId = "subsectorId_example"; // String | Subsector to search.
try {
    List<Row> result = apiInstance.getSubsector(clientId, accessToken, eventId, sectorId, subsectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getSubsector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventId** | **String**| Event to search. |
 **sectorId** | **String**| Sector to search. |
 **subsectorId** | **String**| Subsector to search. |

### Return type

[**List&lt;Row&gt;**](Row.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEvents"></a>
# **getEvents**
> List&lt;Events&gt; getEvents(clientId, accessToken)



Returns a list of existing events.

### Example
```java
// Import classes:
//import com.sensedia.futebolcard.api.v1.client.ApiException;
//import com.sensedia.futebolcard.api.v1.EventsApi;


EventsApi apiInstance = new EventsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
try {
    List<Events> result = apiInstance.getEvents(clientId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |

### Return type

[**List&lt;Events&gt;**](Events.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

