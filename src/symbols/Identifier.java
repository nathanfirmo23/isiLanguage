package symbols;

public class Identifier {
	private String text;
	private DataType type;
	private Integer  value;
	private String  valueText;
	private Double doubleValue;
	private boolean used;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}

	public Identifier(String text, DataType type) {
		super();
		this.text = text;
		this.type = type;
	}

	public Identifier() {
		super();
	}

	@Override
	public String toString() {
		return "Identifier [text=" + text + ", type=" + type + ", value=" + value + ", valueText=" + valueText
				+ ", doubleValue=" + doubleValue + ", used=" + used + "]";
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getValueText() {
		return valueText;
	}

	public void setValueText(String valueText) {
		this.valueText = valueText;
	}
	
	
	public Double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public String generateJavaCode() {
		String str;
		if(type == DataType.REAL) {
			str = "double ";
		}
		else if (type == DataType.INTEGER){
			str = "int ";
		}
		else {
			str = "String ";
		}
		return str + " "+text+";";
	}
}
