package com.yasons.bean.type;

/**
 * @author 
 *性别
 */
public enum Gender {
	MAN {
		@Override
		public String getValue() {
			return "男";
		}

		@Override
		public int getCode() {
			return 1;
		}
	},
	WOMAN {
		@Override
		public String getValue() {
			return "女";
		}

		@Override
		public int getCode() {
			return 2;
		}
	},
	UNKOWN {
		@Override
		public String getValue() {
			return "未知";
		}

		@Override
		public int getCode() {
			return 0;
		}
	};
	
	/**
	 * @return
	 */
	public abstract String getValue();
	
	/**
	 * @return
	 */
	public abstract int getCode();
}
