package mybridge.core.sqlparser;

import java.util.ArrayList;
import java.util.List;

public class ColList {
	List<String> cols = new ArrayList<String>();

	/**
	 * 添加列
	 * 
	 * @param col
	 */
	void add(String col) {
		cols.add(col);
	}

	public List<String> getCols() {
		return cols;
	}

	void setCols(List<String> cols) {
		this.cols = cols;
	}
}
