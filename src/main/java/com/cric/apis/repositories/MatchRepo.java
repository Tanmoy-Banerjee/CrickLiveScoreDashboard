package com.cric.apis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cric.apis.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{
// match fetch 
// providing Team name
	
	Optional<Match> findByTeamHeading(String teamHeading);@Override
		default long count() {
			// TODO Auto-generated method stub
			return 0;
		}
}
