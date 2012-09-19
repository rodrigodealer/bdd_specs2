package br.com.pordotom.controller;

import br.com.pordotom.model.Message;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;


@br.com.caelum.vraptor.Resource
public class IndexController {

	private final Result result;

	public IndexController(Result result) {
		this.result = result;
	}

    @Get
	@Path("/")
	public void index() {
		result.include("variable", "VRaptor!");
	}

    @Get
    @Path("/hello/world")
    public void helloWorld() {
        Message message = new Message(true, "Hello World!");
        result.use(Results.json()).from(message).serialize();
    }

    @Get
    @Path("/hello/world/{params}")
    public void helloWorldWithParams(String params) {
        Message message = new Message(true, params);
        result.use(Results.json()).from(message).serialize();
    }
}
