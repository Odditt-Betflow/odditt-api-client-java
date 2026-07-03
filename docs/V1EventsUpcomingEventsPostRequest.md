

# V1EventsUpcomingEventsPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventDate** | **LocalDate** | Filter by event date (YYYY-MM-DD). Defaults to today (UTC). |  [optional] |
|**leagueId** | **Long** |  |  [optional] |
|**leagueKey** | **String** | League external key (e.g. &#39;nba&#39;, &#39;united-states.nba&#39;). Alternative to league_id. If both are provided, league_id takes precedence. |  [optional] |
|**page** | **Long** | Page number for pagination |  [optional] |
|**pageSize** | **Long** | Number of events per page |  [optional] |
|**sportId** | **Long** |  |  [optional] |
|**sportKey** | **String** | Sport external key (e.g. &#39;american-football&#39;). Alternative to sport_id. If both are provided, sport_id takes precedence. |  [optional] |
|**timezone** | **String** | IANA timezone for date interpretation (e.g. &#39;UTC&#39;, &#39;America/New_York&#39;, &#39;Europe/London&#39;) |  [optional] |



