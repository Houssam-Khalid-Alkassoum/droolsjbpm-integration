
package org.kie.remote.services.ws.sei.history;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.kie.remote.services.ws.common.KieRemoteWebServiceException;
import org.kie.remote.services.ws.sei.ServicesVersion;

/**
 * Only used for initial WSDL generation
 */
@WebService(serviceName = "HistoryService", targetNamespace = HistoryWebService.NAMESPACE)
public interface HistoryWebService {

    final static String NAMESPACE = "http://services.remote.kie.org/" + ServicesVersion.VERSION  + "/history";
    
    @WebMethod(action = "urn:FindProcessInstanceLogs")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FindProcessInstanceLogs", targetNamespace = NAMESPACE, className = "org.kie.remote.services.ws.wsdl.generated.WrapperFindProcInstanceLogs")
    @ResponseWrapper(localName = "FindProcessInstanceLogsResponse", targetNamespace = NAMESPACE, className = "org.kie.remote.services.ws.wsdl.generated.WrapperFindProcessInstLogsResponse")
    public ProcessInstanceLogResponse findProcessInstanceLogs(@WebParam(name = "arg0", targetNamespace = "") HistoryInstanceLogRequest historyInstLogRequest) throws KieRemoteWebServiceException;

    @WebMethod(action = "urn:FindNodeInstanceLogs")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FindNodeInstanceLogs", targetNamespace = NAMESPACE, className = "org.kie.remote.services.ws.wsdl.generated.WrapperFindNodeInstLogs")
    @ResponseWrapper(localName = "FindNodeInstanceLogsResponse", targetNamespace = NAMESPACE, className = "org.kie.remote.services.ws.wsdl.generated.WrapperFindNodeInstLogsResponse")
    public NodeInstanceLogResponse findNodeInstanceLogs(@WebParam(name = "arg0", targetNamespace = "") HistoryInstanceLogRequest historyInstLogRequest) throws KieRemoteWebServiceException;

    @WebMethod(action = "urn:FindVariableInstanceLogs")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FindVariableInstanceLogs", targetNamespace = NAMESPACE, className = "org.kie.remote.services.ws.wsdl.generated.WrapperFindVariableInstLogs")
    @ResponseWrapper(localName = "FindVariableInstanceLogsResponse", targetNamespace = NAMESPACE, className = "org.kie.remote.services.ws.wsdl.generated.WrapperFindVariableInstLogsResponse")
    public VariableInstanceLogResponse findVariableInstanceLogs(@WebParam(name = "arg0", targetNamespace = "") HistoryInstanceLogRequest historyInstLogRequest) throws KieRemoteWebServiceException;

}
