package com.demo.application;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

/**
 * Entity is required to make library-module entities working
 * as otherwise "No EntityManager found"
 *
 * @see https://github.com/quarkusio/quarkus/issues/8059
 */
@Entity
public class EntityRequiredOtherwiseEMNotFound extends PanacheEntity {

}
