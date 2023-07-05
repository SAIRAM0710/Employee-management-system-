package net.project.springboot.model;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {

	GenerationType strategy();

}
