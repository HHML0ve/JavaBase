package base;

public class Table {
	private String _tableName;
	private float _tableWhrite;
	private float _tableHigh;
	private float _tableWridth;
	private float _tablelength;
	
	//构造函数
	public Table(String _tableName, float _tableWhrite, float _tableHigh, float _tableWridth, float _tablelength) {
		super();
		this._tableName = _tableName;
		this._tableWhrite = _tableWhrite;
		this._tableHigh = _tableHigh;
		this._tableWridth = _tableWridth;
		this._tablelength = _tablelength;
	}

	
	//输出所有变量
	public String Display() {
		return "Table [_tableName=" + _tableName + ", _tableWhrite=" + _tableWhrite + ", _tableHigh=" + _tableHigh
				+ ", _tableWridth=" + _tableWridth + ", _tablelength=" + _tablelength + "]";
	}

	
	//计算面积
	public float area(){
		return _tableWridth*_tablelength;
	}


	//改变桌子重量
	public void set_tableWhrite(float _tableWhrite) {
		this._tableWhrite = _tableWhrite;
	}
	

}
