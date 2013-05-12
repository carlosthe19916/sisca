package org.softgreen.sisca.dao.impl;

import java.awt.geom.Area;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import org.softgreen.sisca.dao.GenericDAO;

@Stateless
public class AreaDAO extends GenericDAO<Area> {

 public AreaDAO() {
  super(Area.class);
 }

 public Area findUserByEmail(String email){
  Map<String, Object> parameters = new HashMap<String, Object>();
  parameters.put("email", email);  

  return null;
  //return super.findOneResult(Area.FIND_BY_EMAIL, parameters);
 }
}