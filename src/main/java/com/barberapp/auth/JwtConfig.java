package com.barberapp.auth;

public class JwtConfig {
	
	public static final String RSA_PRIVADA = "-----BEGIN PRIVATE KEY-----\r\n"
			+ "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCTopORg6vliXZb\r\n"
			+ "aIE1aHnkpWEpFNj/W4Wh+0csZ+7gq+DYe4jNxVza/bOHJK3kKtDl1sBjZf+BirlL\r\n"
			+ "vHzACGpLfyQNfXTi12znrbSjZ4zH2d+qrgIVgdDfaoT62Ea/69dxQWrkMufkDbUF\r\n"
			+ "0srCDP7p2lNUfP5giFt/VtxfycNjcHlt/plDxt4TYeVuvs63l3oIF4qykYUmig7p\r\n"
			+ "E80QNFgNxmObXFphEEq1I7AIYetu2/VBtQWWk57F9lOL+THLILWW23rTURIAo+Ip\r\n"
			+ "oeT4vF7/GMge3NtdHcnoNDea6IQzHfCCVxuf+1wDGy2KOM+XVGtHCWQqp0q8U24R\r\n"
			+ "/krf11WnAgMBAAECgf8GZrllr2l31zEw+KPUxplPNw+ynrTJ90eHPneKwioZYI2s\r\n"
			+ "CHv/o0JJ1hyl2QrkWcO1AE3wzi6SvCRMpF+RJzKn4CgwBybwrwAjceSv/ecDKbwI\r\n"
			+ "909TBc3vFS9IfeT508ADqR9GLCIVDhyxo/ImqwMvU8gV+1Vypt1QwcAyzXMrXIqj\r\n"
			+ "eeqnVhwkK3udo3RuCies40OrWgSbMpOgsEhYzQ1ZG96Vf2uTXejaXcnDXJUgJj56\r\n"
			+ "IvcMiAb3tjx9c9BcKLGeUXhvxn8l5ucCeD0i4XYrYFK5Rf0kdVObN9TQV7e3/m6B\r\n"
			+ "Q3GNKyk76nkxFY1V+0Dkmr6fVqdni3WKsTpZMWUCgYEAvTSu2qLKtiX7izMNDQo6\r\n"
			+ "KSg1REAAUiXTS2zyzvW8indu/Ya/NeLG2HE4S7W3MRhNKSAolowq3CR61anCHiDv\r\n"
			+ "vFlvUodS+LQWtPK/0MIkQxVHscZB1O9cCQr8r7I/2mlqLIdaE4k6JDUySuD4vmqC\r\n"
			+ "gmI8UMuybaiP8YiChh4k0M0CgYEAx8D5I2q3zn8p1Mx/skNm5CHH/aKhoq1T/I9h\r\n"
			+ "VOy4Zvppccb0r3xHewiCqNT6ZUyYuRHZ4GIh0H38jfvYbVMtbROhdXIkicSCycaE\r\n"
			+ "tYSO7u/cyj0ChOk1yJlNuelCdaI6rPHgPMpdwh8pSkTANZ0OHoc2TGiSPPOBcVDy\r\n"
			+ "FthHcEMCgYA8QTXaLPPPlEMKboSefX5OMx7bkGJJxwAGSjj9TebwVd7D4JCuUX0v\r\n"
			+ "2sap3cHsYafZDAPBBfx0RS3VM429WJHgcr7wEmaLC5cbox8RFXLE5lcBt3ipnly6\r\n"
			+ "CIS2U1bgcKe+bJB0HkSk2Ugd7o1o3rSXXz+EH4rAP2kv62Bd4+WnlQKBgQCHnNZH\r\n"
			+ "mjMRiTmQFAn5r1LSPLD23AuaUsw7Ieh1bITAvO8LZIRIAzrQJ3X1Qyp/zWG9+4WM\r\n"
			+ "lXLZhj8I8dr8VcT4UaSDBKwTsAsPC6ybQ1R6mPOvhX4JV/7AonunZNpO3IWzVj7j\r\n"
			+ "ZowCt38jwcswWuD0Dt3pP/FQWg0eLlM8+TZ+2wKBgQC0zAlPT2sJbM2aDzd1X64P\r\n"
			+ "O3MLcIoMT4DFpVQmsQwRPcsOPEBMuMP4ccjS1DSyNQiACQMf+I4iNcVwTxnjaMbc\r\n"
			+ "0riNLHpdWdk7tDzOtTRRYu0awdL94VslvlSNXBppQy+2/gnVwCDblrjLKuoLSfJ3\r\n"
			+ "kCCNpf4jKOR0BlFLOJFqDg==\r\n"
			+ "-----END PRIVATE KEY-----";
	
	
			public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk6KTkYOr5Yl2W2iBNWh5\r\n"
			+ "5KVhKRTY/1uFoftHLGfu4Kvg2HuIzcVc2v2zhySt5CrQ5dbAY2X/gYq5S7x8wAhq\r\n"
			+ "S38kDX104tds5620o2eMx9nfqq4CFYHQ32qE+thGv+vXcUFq5DLn5A21BdLKwgz+\r\n"
			+ "6dpTVHz+YIhbf1bcX8nDY3B5bf6ZQ8beE2Hlbr7Ot5d6CBeKspGFJooO6RPNEDRY\r\n"
			+ "DcZjm1xaYRBKtSOwCGHrbtv1QbUFlpOexfZTi/kxyyC1ltt601ESAKPiKaHk+Lxe\r\n"
			+ "/xjIHtzbXR3J6DQ3muiEMx3wglcbn/tcAxstijjPl1RrRwlkKqdKvFNuEf5K39dV\r\n"
			+ "pwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}
