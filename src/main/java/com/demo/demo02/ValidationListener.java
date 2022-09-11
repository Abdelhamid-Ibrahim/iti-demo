/* (C)2022 */
package com.demo.demo02;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.demo.Artist;

/** @author Antonio Goncalves http://www.antoniogoncalves.org -- */
public class ValidationListener {

	// ======================================
	// = Lifecycle Methods =
	// ======================================

	@PrePersist
	@PreUpdate
	private void validate(Artist artist) {
		System.out.println(".DataValidationListener validate()");
		if (artist.getFirstName() == null || "".equals(artist.getFirstName()))
			throw new IllegalArgumentException("Invalid first name");
		if (artist.getLastName() == null || "".equals(artist.getLastName()))
			throw new IllegalArgumentException("Invalid last name");
	}
}
