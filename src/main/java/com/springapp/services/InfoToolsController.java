package com.springapp.services;

import com.springapp.infotool.InfoTool;
import com.springapp.infotool.dao.InfoToolDaoImpl;
import com.springapp.services.controlcenter.ControlServiceClient;
import com.springapp.services.spacesituation.SpaceSituationServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/InfoToolsService")
public class InfoToolsController {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    InfoToolDaoImpl infoToolDao = (InfoToolDaoImpl)applicationContext.getBean("InfoToolDaoImpl");

    @Autowired
    private SpaceSituationServiceClient spaceSituationServiceClient;

    @Autowired
    private ControlServiceClient controlServiceClient;

    @RequestMapping(value = "/fromControlCenter")
    private void sendToSpaceSituation(HttpServletRequest request) throws IOException {
        String json = request.getReader().readLine();
        System.out.println(json);

        String detectedObjects = spaceSituationServiceClient.getDetectedObjects(json);
        controlServiceClient.sendToControlCenter(detectedObjects);
    }

    @RequestMapping(value = "/test")  //удалить (для тестирования бд)
    private void test(HttpServletRequest request) {
        InfoTool infoTool = new InfoTool();
        infoTool.setType(34324);
        infoTool.setStateLongitude(5435);
        infoTool.setStateLatitude(4534);
        infoTool.setStateHeight(4543);
        infoTool.setZoneType(454);
        infoTool.setRangeMax(435);
        infoTool.setRangeMin(4543);
        infoTool.setAzimutMax(435);
        infoTool.setAzimutMin(43534);
        infoTool.setPlaceAngleMax(435);
        infoTool.setPlaceAngleMin(435);
        infoTool.setRange(43);
        infoTool.setPenetratingPower(435);
        infoTool.setCountInTime(345);
        infoToolDao.create(infoTool);
    }
}
