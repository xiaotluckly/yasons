package com.yasons.bean.type;

/**
 * 订单类型
 * 
 */
public enum OrderState {

	RESERVED {
		@Override
		public String getValue() {
			return "已预定";
		}

		@Override
		public int getCode() {
			return 0;
		}
	},
	COMPLETED {
		@Override
		public String getValue() {
			return "已完成";
		}

		@Override
		public int getCode() {
			return 1;
		}
	},
	CANCELED {
		@Override
		public String getValue() {
			return "已取消";
		}

		@Override
		public int getCode() {
			return 2;
		}
	},
	OVERDUE {
		@Override
		public String getValue() {
			return "已过期";
		}

		@Override
		public int getCode() {
			return 3;
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
