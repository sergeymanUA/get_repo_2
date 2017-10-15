<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Accounts</title>
    </head>
    <body>
        <section>
            <div class="pull-right" style="padding-right: 50px">
                <!-- <a href="?language=en">English</a>|<a href="?language=nl">Dutch</a> -->
                <a href="<c:url value="/logout" />">Logout</a>
            </div>
        </section>

        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Accounts</h1>
                    <p>Add accounts</p>
                </div>
            </div>
        </section>
        <section class="container">
            <form:form method="POST" modelAttribute="newAccount"
                       class="form-horizontal" enctype="multipart/form-data">
                <fieldset>
                    <legend>Add new account</legend>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="id">
                        Account Id
                        	<%-- <spring:message code="addAccount.form.id.label" /> --%>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="id" path="id" type="text"
                                        class="form:input-large" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="ownerName">
                        	<%-- <spring:message code="addAccount.form.ownerName.label" /> --%>
                        	Owner name
                        </label>
                        <div class="col-lg-10">
                            <form:input id="ownerName" path="ownerName" type="text"
                                        class="form:input-large" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="balance">
                        	<%-- <spring:message code="addAccount.form.balance.label" /> --%>
                        	Balance
                        </label>
                        <div class="col-lg-10">
                            <form:input id="balance" path="balance" type="text"
                                        class="form:input-large" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="accessTime">
                        	<%-- <spring:message code="addAccount.form.accessTime.label" /> --%>
                        	Access time
                        </label>
                        <div class="col-lg-10">
                            <form:input id="accessTime" path="accessTime" type="text"
                                        class="form:input-large" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="locked">
                        	<%-- <spring:message code="addAccount.form.category.label" /> --%>
                        	Locked
                        </label>
                        <div class="col-lg-10">
                            <form:input id="category" path="locked" type="text"
                                        class="form:input-large" />
                        </div>
                    </div>

                    

                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <input type="submit" id="btnAdd" class="btn btn-primary"
                                   value="Add" />
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </section>
    </body>
</html>
