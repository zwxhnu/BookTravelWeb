package test;

import net.tsz.afinal.FinalHttp;
import net.tsz.afinal.http.AjaxCallBack;
import net.tsz.afinal.http.AjaxParams;

public class test {
	private static String url = "http://localhost:8080/Bigger/UserLogin.action";

	public static void main(String[] args) {
		test t = new test();
		t.Login(url);
		// String result = t.Login(url);
		// JSONObject jsonObject = JSONObject.fromObject(result);
		// System.out.println(jsonObject);
	}

	public void Login(final String url) {
		String resData = null;
		// HttpClient client = new DefaultHttpClient();
		try {
			// 发送请求
			// HttpPost httppost = new HttpPost(new URI(url));
			AjaxParams params = new AjaxParams();
			params.put("userphone", "110");
			params.put("password", "111");
			FinalHttp fh = new FinalHttp();
			fh.get(url, params, new AjaxCallBack<Object>() {
				@Override
				public void onSuccess(Object t) {
					// TODO Auto-generated method stub
					System.out.println(t.toString());
					super.onSuccess(t);
				}

				@Override
				public void onFailure(Throwable t, int errorNo, String strMsg) {
					// TODO Auto-generated method stub
					Login(url);
					super.onFailure(t, errorNo, strMsg);
				}
			});
			// fh.configSSLSocketFactory(SSL.getSocketFactory());
			// List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			// nvps.add(new BasicNameValuePair("userphone", "110"));
			// nvps.add(new BasicNameValuePair("password", "111"));
			// httppost.setEntity(new UrlEncodedFormEntity(nvps));
			// 返回响应
			// HttpResponse response = client.execute(httppost);
			// if (response.getStatusLine().getStatusCode() == HttpStatus.OK
			// .value()) {
			// HttpEntity entity = response.getEntity();
			// resData = EntityUtils.toString(entity);
			// return resData;
			// }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败了.");
			// return resData;
		}
		System.out.println("qqq");
		// return resData;
	}
}
