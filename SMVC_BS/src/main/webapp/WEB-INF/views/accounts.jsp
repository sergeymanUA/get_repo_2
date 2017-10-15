<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Products</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Accounts</h1>
                    <p>All the available accounts in app</p>
                </div>
            </div>
        </section>

        <section class="container">
            <div class="row">
                <c:forEach items="${newAccount}" var="newAccount">
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <div class="caption">
                                <h3>${newAccount.id}</h3>
                                <p>${newAccount.ownerName}</p>
                                <p>$${newAccount.balance}</p>
                                <p>Available ${newAccount.accessTime} units in stock</p>
                                <p>
                                    <%-- <a href=" <spring:url value="/market/product?id=${product.productId}" /> "
                                        class="btn btn-primary"> 
                                        <span class="glyphicon-info-sign glyphicon" /></span> 
                                        Details
                                    </a> --%>
                                </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
    </body>
</html>
