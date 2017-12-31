package gambit;

public class GambitDecryption {
	
	public static final int a = 138;
	public static final int b = 120;
	public static final int c = -106;

	public static void main(String[] args) {
		
		String[] code = "210 221 2 246 231 194 170 187 5 248 223 8 235 236 11 246 217 10 243 231 4 253 152 252 249 234 182 253 231 2 0 225 4 241 152 10 242 221 182 209 217 3 236 225 10 170 219 254 235 228 2 239 230 253 239 166 182 218 228 251 235 235 251 170 235 251 248 220 182 3 231 11 252 152 9 249 228 11 254 225 5 248 152 247 248 220 182 205 206 182 254 231 182 243 219 247 248 219 5 238 221 214 241 217 3 236 225 10 252 221 9 239 217 8 237 224 196 237 231 3 170 233 11 249 236 255 248 223 182 252 221 252 239 234 251 248 219 251 196 152 250 236 171 252 191 222 202 187 221 200 184".split("\\s+");
		for (int i=0; i<code.length;i++) {
			if (i%3==0) System.out.print((char) ((Integer.parseInt(code[i]) - a) % 256));
			if (i%3==1) System.out.print((char) ((Integer.parseInt(code[i]) - b) % 256));
			if (i%3==2) System.out.print((char) ((Integer.parseInt(code[i]) - c) % 256));
		}
	}

}
