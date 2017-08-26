package com.sensedia.futebolcard.api.v1;

import com.sensedia.futebolcard.api.v1.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sensedia.futebolcard.api.v1.model.Error;
import com.sensedia.futebolcard.api.v1.model.Events;
import com.sensedia.futebolcard.api.v1.model.Row;
import com.sensedia.futebolcard.api.v1.model.Sectors;
import com.sensedia.futebolcard.api.v1.model.SubSectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface EventsApi {
  /**
   * 
   * Returns the details for a specific occurring event.
   * @param clientId Customer identifier used for authentication. (required)
   * @param accessToken Access token used in the authentication. (required)
   * @param eventId Event to search. (required)
   * @return Call&lt;Events&gt;
   */
  @GET("events/{eventId}")
  Call<Events> getEvent(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("eventId") String eventId
  );

  /**
   * 
   * Returns a list of sector for the given event.
   * @param clientId Customer identifier used for authentication. (required)
   * @param accessToken Access token used in the authentication. (required)
   * @param eventId Event to search. (required)
   * @return Call&lt;Sectors&gt;
   */
  @GET("events/{eventId}/sectors")
  Call<Sectors> getSectors(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("eventId") String eventId
  );

  /**
   * 
   * Returns the details of a specific sector.
   * @param clientId Customer identifier used for authentication. (required)
   * @param accessToken Access token used in the authentication. (required)
   * @param eventId Event to search. (required)
   * @param sectorId Sector to search. (required)
   * @return Call&lt;SubSectors&gt;
   */
  @GET("events/{eventId}/sectors/{sectorId}")
  Call<SubSectors> getSector(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("eventId") String eventId, @retrofit2.http.Path("sectorId") String sectorId
  );

  /**
   * 
   * Returns a list of subcsectors for a given sector.
   * @param clientId Customer identifier used for authentication. (required)
   * @param accessToken Access token used in the authentication. (required)
   * @param eventId Event to search. (required)
   * @param sectorId Sector to search. (required)
   * @return Call&lt;SubSectors&gt;
   */
  @GET("events/{eventId}/sectors/{sectorId}/subsectors")
  Call<SubSectors> getSubsectors(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("eventId") String eventId, @retrofit2.http.Path("sectorId") String sectorId
  );

  /**
   * 
   * Returns a list of seat&#39;s information for each row of a given subsector.
   * @param clientId Customer identifier used for authentication. (required)
   * @param accessToken Access token used in the authentication. (required)
   * @param eventId Event to search. (required)
   * @param sectorId Sector to search. (required)
   * @param subsectorId Subsector to search. (required)
   * @return Call&lt;List&lt;Row&gt;&gt;
   */
  @GET("events/{eventId}/sectors/{sectorId}/subsectors/{subsectorId}")
  Call<List<Row>> getSubsector(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("eventId") String eventId, @retrofit2.http.Path("sectorId") String sectorId, @retrofit2.http.Path("subsectorId") String subsectorId
  );

  /**
   * 
   * Returns a list of existing events.
   * @param clientId Customer identifier used for authentication. (required)
   * @param accessToken Access token used in the authentication. (required)
   * @return Call&lt;List&lt;Events&gt;&gt;
   */
  @GET("events")
  Call<List<Events>> getEvents(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken
  );

}
