package org.popins.dev.proxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.popins.dev.model.TvSeries;

//@RegisterRestClient(baseUri="https://api.tvmaze.com/") the base URI will now be fetched from properties
@RegisterRestClient
@Path("/singlesearch/")
@Produces(MediaType.APPLICATION_JSON)
public interface TvSeriesProxy {

	@GET
	@Path("/shows")
	public TvSeries getTvSeries(@QueryParam("q") String title);
}
