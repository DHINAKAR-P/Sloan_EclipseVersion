package geppetto.Sloan_test_1_10000.hnb.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;


import geppetto.Sloan_test_1_10000.hnb.domain.core.People_test;

import geppetto.Sloan_test_1_10000.hnb.service.Landing_pageService;



/**
 * 
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p> 
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC 2014 - 2015</br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/
@Controller("Landing_pageController")
@RequestMapping("/Landing_page")
public class Landing_pageController extends GpBaseController {


	Landing_pageService Landing_page_service;


	public Landing_pageService get_Landing_page_service() {
		return Landing_page_service;
	}


	@Resource(name="Landing_pageService")
	public void set_Landing_page_service(Landing_pageService Landing_page_service) {
		this.Landing_page_service = Landing_page_service;
	}




	//auths not ready at this time
	@RequestMapping(method = RequestMethod.GET, value = "/search_for_update_People_test/", headers="Accept=application/json")
    @ResponseBody
	public People_test search_for_update_People_test(@RequestParam("People_test_id")long People_test_id) throws Exception {

		People_test the_People_test = new People_test();

		the_People_test = Landing_page_service.people_test_search_for_update(People_test_id, super.getUser());

		return the_People_test;

	}

	//auths not ready at this time
	@RequestMapping(method = RequestMethod.POST, value = "/update_People_test/", headers="Accept=application/json")
    @ResponseBody
	public People_test update_People_test(@RequestBody People_test the_People_test) throws Exception {

		People_test a_People_test;

		a_People_test = Landing_page_service.update_people_test(the_People_test, super.getUser());

		return a_People_test;

	}




}