/* (C)2022 */
package com.demo.demo02;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

import com.demo.Artist;

/** @author Antonio Goncalves http://www.antoniogoncalves.org -- */
public class AgeCalculationListener {

	// ======================================
	// = Lifecycle Methods =
	// ======================================

	@PostLoad
	@PostPersist
	@PostUpdate
	public void calculateAge(Artist artist) {
		System.out.println(".AgeCalculationListener calculateAge()");
		if (artist.getDateOfBirth() == null) {
			artist.setAge(null);
			return;
		}

		artist.setAge(Period.between(artist.getDateOfBirth(), LocalDate.now()).getYears());
	}
}
