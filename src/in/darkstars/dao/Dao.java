package in.darkstars.dao;

import in.darkstars.dto.DataTransferObject;
import in.darkstars.exception.DataAccessException;
import in.darkstars.exception.DataSourceException;
import in.darkstars.exception.RecordNotFoundException;

/**
 * @author dis-card
 *
 */
public interface Dao {
	
	int save(DataTransferObject dataTransferObject);
	DataTransferObject get(int id);
	DataTransferObject get(String id);
	void check(DataTransferObject dataTransferObject) throws DataSourceException, DataAccessException, RecordNotFoundException;

}
