/**
 * ProductsListerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edureka.javasql2.webservices.products;

public class ProductsListerServiceLocator extends org.apache.axis.client.Service implements com.edureka.javasql2.webservices.products.ProductsListerService {

    public ProductsListerServiceLocator() {
    }


    public ProductsListerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductsListerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductsLister
    private java.lang.String ProductsLister_address = "http://localhost:8080/WebServices-Products/services/ProductsLister";

    public java.lang.String getProductsListerAddress() {
        return ProductsLister_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductsListerWSDDServiceName = "ProductsLister";

    public java.lang.String getProductsListerWSDDServiceName() {
        return ProductsListerWSDDServiceName;
    }

    public void setProductsListerWSDDServiceName(java.lang.String name) {
        ProductsListerWSDDServiceName = name;
    }

    public com.edureka.javasql2.webservices.products.ProductsLister getProductsLister() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductsLister_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductsLister(endpoint);
    }

    public com.edureka.javasql2.webservices.products.ProductsLister getProductsLister(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.edureka.javasql2.webservices.products.ProductsListerSoapBindingStub _stub = new com.edureka.javasql2.webservices.products.ProductsListerSoapBindingStub(portAddress, this);
            _stub.setPortName(getProductsListerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductsListerEndpointAddress(java.lang.String address) {
        ProductsLister_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.edureka.javasql2.webservices.products.ProductsLister.class.isAssignableFrom(serviceEndpointInterface)) {
                com.edureka.javasql2.webservices.products.ProductsListerSoapBindingStub _stub = new com.edureka.javasql2.webservices.products.ProductsListerSoapBindingStub(new java.net.URL(ProductsLister_address), this);
                _stub.setPortName(getProductsListerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProductsLister".equals(inputPortName)) {
            return getProductsLister();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://products.webservices.javasql2.edureka.com", "ProductsListerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://products.webservices.javasql2.edureka.com", "ProductsLister"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductsLister".equals(portName)) {
            setProductsListerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
