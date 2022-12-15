package model.entities;

import java.util.Objects;

public class Departament {
	private Integer Id; 
	private String name;
	
	public Departament() {
		
	}
	
	public Departament(Integer id, String name) {
		Id = id;
		this.name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departament other = (Departament) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Departament [Id=" + Id + ", name=" + name + "]";
	} 
	
	
	
	
	
}
