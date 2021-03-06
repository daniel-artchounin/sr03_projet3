package dao;

/* The interface of the class witch interacts with the database 
 * to add, modify or delete some elements linked to an ad.
 * */
public interface AdDao {
    void dropCategory(String category) throws DaoException;
	void updateCategory(String oldCategoryName, String newCategoryName) throws DaoException;
	void addCategory(String categoryName) throws DaoException;
	public String getCategoriesNames(int yearBook) throws DaoException;
	public String getStreetsNames(int yearBook) throws DaoException;
	public String getTownsNames(int yearBook) throws DaoException;
	public String getPostCodes(int yearBook) throws DaoException;
}