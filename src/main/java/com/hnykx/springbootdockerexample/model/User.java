package com.hnykx.springbootdockerexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {
  @Id
  private Long id;
  private String userName;
  private String sex;
}
