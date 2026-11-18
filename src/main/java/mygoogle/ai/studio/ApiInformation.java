package mygoogle.ai.studio;

public final class ApiInformation {
	// Google AI StudioのAPIキーを設定
	private static final String API_KEY = "自分のAPIキーを入力してください";
	// Google AI StudioをアクセスするURL 
	private static final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-3.5-flash-lite:generateContent"; 
		
	public String getApiKey() {
		return API_KEY;
	}
	
	public String getUrl() {
		return API_URL;
	}
}
