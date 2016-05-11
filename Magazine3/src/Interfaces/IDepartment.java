package Interfaces;

import java.util.ArrayList;

public interface IDepartment {
	String getName();
	ArrayList<IEmployer> getEmployerList();
	ArrayList<IProduct> getProductList();
}
