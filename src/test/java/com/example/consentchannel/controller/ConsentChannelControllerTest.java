package com.example.consentchannel.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(classes = ConsentChannelController.class, webEnvironment = WebEnvironment.NONE)
class ConsentChannelControllerTest {

  @Autowired
  private ConsentChannelController consentChannelController;

  @Test
  void initConsent() {}

  @Test
  void authConsent() {}

  @Test
  void extractQueryString() throws Exception {
    String query = "client_id%253DSwCIxkpf8em1ZbS5CM7MRSh9PnheUNNd%2526scope%253Dopenid+accounts%2526redirect_uri%253Dhttp%253A%252F%252Flocalhost%253A8585%252FredirectMe%2526response_type%253Dcode+id_token%2526someOtherParam%253Dblahblah%2526request%253DeyJraWQiOiJzYW1wbGVUcHBLaWQiLCJhbGciOiJSUzI1NiJ9.eyJyZXNwb25zZV90eXBlIjoiY29kZSBpZF90b2tlbiIsImNsaWVudF9pZCI6IlN3Q0l4a3BmOGVtMVpiUzVDTTdNUlNoOVBuaGVVTk5kIiwiYXVkIjoiaHR0cHM6Ly9haWItcHJvZC1wcm9kLmFwaWdlZS5uZXQiLCJzY29wZSI6Im9wZW5pZCBhY2NvdW50cyIsInN0YXRlIjoiOWU3MjY3NDgtYzExOS00NmRkLTg0ZGMtMjQxY2MzOWQ2ZDdjIiwibm9uY2UiOiJmNWNjYWQ1Zi0yMzdkLTQzNTYtYmNiNi0yM2M2YmZmMTBhNDUiLCJtYXhfYWdlIjoiODY0MDAwMCIsImlhdCI6MTU3NDk0MzcxNCwicmVkaXJlY3RfdXJpIjoiaHR0cDovL2xvY2FsaG9zdDo4NTg1L3JlZGlyZWN0TWUiLCJjbGFpbXMiOnsidXNlcmluZm8iOnsib3BlbmJhbmtpbmdfaW50ZW50X2lkIjp7InZhbHVlIjoidXJuOmFpYjphcGlnYXRld2F5Om9wZW4tYmFua2luZzphaXNwOmFjY291bnQtYWNjZXNzLWNvbnNlbnRzOnYzLjE6MTE3ZDU0NDMtNGVkNS00Njg5LWE5MjMtNjAxMDk4ZmYyNzQ0IiwiZXNzZW50aWFsIjp0cnVlfX0sImlkX3Rva2VuIjp7Im9wZW5iYW5raW5nX2ludGVudF9pZCI6eyJ2YWx1ZSI6InVybjphaWI6YXBpZ2F0ZXdheTpvcGVuLWJhbmtpbmc6YWlzcDphY2NvdW50LWFjY2Vzcy1jb25zZW50czp2My4xOjExN2Q1NDQzLTRlZDUtNDY4OS1hOTIzLTYwMTA5OGZmMjc0NCIsImVzc2VudGlhbCI6dHJ1ZX0sImFjciI6eyJlc3NlbnRpYWwiOnRydWUsInZhbHVlcyI6WyJ1cm46YWliOmFwaWdhdGV3YXk6b3Blbi1iYW5raW5nOmFpc3A6YWNjb3VudC1hY2Nlc3MtY29uc2VudHM6djMuMToxMTdkNTQ0My00ZWQ1LTQ2ODktYTkyMy02MDEwOThmZjI3NDQiXX19fSwiZXhwIjoxNTc0OTQ3MzE0fQ.FsCGyN3O5GQ2DtjIHDQgNrqi2av3rzu2LJsWj5ZhYE5bDvGvyacn89kIeCZToDXQKGX_4LvTRWcto4jXISI8voyyBL9Prb4TDynlgXpOJ1PIV5Xs9NbkWNnJRuLWgShzw_OlNruZlD3AR61KbN9SvxLTin3ds_0DVwZX1FS0PgBz33LqWffhhKal0V4FUTqD1FUKMP6Q-8WqeyHOhCMqUqVM3S32tfin7RMODzZeS75_FZxgr199i8BVllgGBMx4nnvVwEL1P3SAa49H5OF4cvbsGvoj5TUXua31c4z1ximxCkhwx2-JBoQHtQ91fGm3hknDFxfg8mNEBJ6cRVZhWQ%2526state%253D9e726748-c119-46dd-84dc-241cc39d6d7c%2526nonce%253Df5ccad5f-237d-4356-bcb6-23c6bff10a45";
    System.out.println(consentChannelController.extractQueryString(query, "request"));

  }
}