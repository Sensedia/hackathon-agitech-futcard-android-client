package com.sensedia.futebolcard.api.v1;

import com.sensedia.futebolcard.api.v1.client.ApiClient;
import com.sensedia.futebolcard.api.v1.model.Error;
import com.sensedia.futebolcard.api.v1.model.Events;
import com.sensedia.futebolcard.api.v1.model.Row;
import com.sensedia.futebolcard.api.v1.model.Sectors;
import com.sensedia.futebolcard.api.v1.model.SubSectors;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
public class EventsApiTest {

    private EventsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EventsApi.class);
    }

    
    /**
     * 
     *
     * Returns the details for a specific occurring event.
     */
    @Test
    public void getEventTest() {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        // Events response = api.getEvent(clientId, accessToken, eventId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of sector for the given event.
     */
    @Test
    public void getSectorsTest() {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        // Sectors response = api.getSectors(clientId, accessToken, eventId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the details of a specific sector.
     */
    @Test
    public void getSectorTest() {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        String sectorId = null;
        // SubSectors response = api.getSector(clientId, accessToken, eventId, sectorId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of subcsectors for a given sector.
     */
    @Test
    public void getSubsectorsTest() {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        String sectorId = null;
        // SubSectors response = api.getSubsectors(clientId, accessToken, eventId, sectorId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of seat&#39;s information for each row of a given subsector.
     */
    @Test
    public void getSubsectorTest() {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        String sectorId = null;
        String subsectorId = null;
        // List<Row> response = api.getSubsector(clientId, accessToken, eventId, sectorId, subsectorId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of existing events.
     */
    @Test
    public void getEventsTest() {
        String clientId = null;
        String accessToken = null;
        // List<Events> response = api.getEvents(clientId, accessToken);

        // TODO: test validations
    }
    
}
