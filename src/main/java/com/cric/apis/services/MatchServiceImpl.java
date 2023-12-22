package com.cric.apis.services;

import java.util.List;
import java.util.Map;

import com.cric.apis.entities.Match;
import com.cric.apis.repositories.MatchRepo;

public class MatchServiceImpl implements MatchService {

	
	private MatchRepo matchRepo;
	
	public MatchServiceImpl(MatchRepo matchRepo) {
		super();
		this.matchRepo = matchRepo;
	}

	// match history all matches in our database
	@Override
	public List<Match> getAllMatches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Match> getLiveMatches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> getPointTable() {
		// TODO Auto-generated method stub
		return null;
	}

}
