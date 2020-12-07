package fit.service;

public class CompnayServiceImpl implements CompanyService{

	@Override
	public String getUpper(String name) {
		return name.toUpperCase();
	}

}
