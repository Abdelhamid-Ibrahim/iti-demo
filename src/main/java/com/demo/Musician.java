/* (C)2022 */
package com.demo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import com.demo.demo02.ValidationListener;

/** @author Antonio Goncalves http://www.antoniogoncalves.org -- */
@Entity
@EntityListeners({ValidationListener.class})
public class Musician extends Artist {

	// ======================================
	// = Attributes =
	// ======================================

	@Column(name = "preferred_instrument")
	private String preferredInstrument;

	// ======================================
	// = Constructors =
	// ======================================

	public Musician() {
	}

	public Musician(String firstName, String lastName, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	// ======================================
	// = Getters & Setters =
	// ======================================

	public String getPreferredInstrument() {
		return preferredInstrument;
	}

	public void setPreferredInstrument(String preferredInstrument) {
		this.preferredInstrument = preferredInstrument;
	}

	// ======================================
	// = hashcode, equals & toString =
	// ======================================

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;

		Musician musician = (Musician) o;

		if (preferredInstrument != null
				? !preferredInstrument.equals(musician.preferredInstrument)
				: musician.preferredInstrument != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (preferredInstrument != null ? preferredInstrument.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Musician{");
		sb.append("id=").append(id);
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", dateOfBirth=").append(dateOfBirth);
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}
}
