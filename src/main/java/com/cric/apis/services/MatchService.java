package com.cric.apis.services;

import java.util.List;
import java.util.Map;

import com.cric.apis.entities.Match;

public interface MatchService {

	// get all matches
	List<Match> getAllMatches();
	
	//get live matches
	List<Match> getLiveMatches();
	
	//get CWC2023 points table
	
	List<Map<String, String>> getPointTable();
}
