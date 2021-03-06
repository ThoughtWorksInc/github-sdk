package com.thoughtworks.microbuilder.tutorial.githubSdk.rpc;

import jsonStream.rpc.Future;
import haxe.ds.Vector;
import com.thoughtworks.microbuilder.tutorial.githubSdk.model.OrganizationSummary;

interface IOrganizationService {

  @:requestHeader("User-Agent", "organization-list-cli")
  @:route("GET", "users/{username}/orgs")
  function listUserOrganizations(username:String):Future<Vector<OrganizationSummary>>;

  // TODO: Other endpoints described at https://developer.github.com/v3/orgs/

}
