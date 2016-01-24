package com.thoughtworks.microbuilder.tutorial.githubSdk.rpc;

import jsonStream.rpc.Future;
import haxe.ds.Vector;
import com.thoughtworks.microbuilder.tutorial.githubSdk.model.OrgnizationSummary;

@:nativeGen
interface IOrganizationService {

  @:route("GET", "/users/{username}/orgs")
  function listUserOrganizations(username:String):Future<Vector<OrgnizationSummary>>;

  // TODO: Other endpoints described at https://developer.github.com/v3/orgs/

}
