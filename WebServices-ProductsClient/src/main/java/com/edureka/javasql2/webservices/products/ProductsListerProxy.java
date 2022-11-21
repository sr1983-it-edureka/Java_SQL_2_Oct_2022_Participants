package com.edureka.javasql2.webservices.products;

public class ProductsListerProxy implements com.edureka.javasql2.webservices.products.ProductsLister {
  private String _endpoint = null;
  private com.edureka.javasql2.webservices.products.ProductsLister productsLister = null;
  
  public ProductsListerProxy() {
    _initProductsListerProxy();
  }
  
  public ProductsListerProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductsListerProxy();
  }
  
  private void _initProductsListerProxy() {
    try {
      productsLister = (new com.edureka.javasql2.webservices.products.ProductsListerServiceLocator()).getProductsLister();
      if (productsLister != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productsLister)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productsLister)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productsLister != null)
      ((javax.xml.rpc.Stub)productsLister)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.edureka.javasql2.webservices.products.ProductsLister getProductsLister() {
    if (productsLister == null)
      _initProductsListerProxy();
    return productsLister;
  }
  
  public java.lang.String listProducts(java.lang.String category) throws java.rmi.RemoteException{
    if (productsLister == null)
      _initProductsListerProxy();
    return productsLister.listProducts(category);
  }
  
  
}