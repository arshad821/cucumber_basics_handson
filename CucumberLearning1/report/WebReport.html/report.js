$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 2,
  "name": "logintest feature for Orange HRM",
  "description": "",
  "id": "logintest-feature-for-orange-hrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Logintest"
    },
    {
      "line": 1,
      "name": "@DataDriven"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Login Scenario",
  "description": "",
  "id": "logintest-feature-for-orange-hrm;login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is entering valid username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is clicking login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 19163176600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_is_entering_valid_username_and_Password()"
});
formatter.result({
  "duration": 819534900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_is_clicking_login_button()"
});
formatter.result({
  "duration": 62528200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_should_navigated_to_home_page()"
});
formatter.result({
  "duration": 11951636200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Employee List\"}\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027LTIN407337\u0027, ip: \u0027192.168.10.227\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\2143925\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:53913}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: e5d01820b168455d11b18b822de95d5d\n*** Element info: {Using\u003dlink text, value\u003dEmployee List}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:373)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat stepdefinition.LoginTestStepDef.user_should_navigated_to_home_page(LoginTestStepDef.java:45)\r\n\tat ✽.Then user should navigated to home page(LoginTest.feature:7)\r\n",
  "status": "failed"
});
});