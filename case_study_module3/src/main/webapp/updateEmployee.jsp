
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<style>
    .bg-image-vertical {
        position: relative;
        overflow: hidden;
        background-repeat: no-repeat;
        background-position: right center;
        background-size: auto 100%;
    }

    @media (min-width: 1025px) {
        .h-custom-2 {
            height: 100%;
        }
    }
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>
<h1>Customer details</h1>
<p>
    <a href="/customer?actionUser=showList">Back to customer list</a>
    </br>
    <a href="/customer">Back to home furama</a>
</p>
<section class="vh-100">
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-6 text-black">

                <div class="px-5 ms-xl-4">
                    <i class="fas fa-crow fa-2x me-3 pt-5 mt-xl-4" style="color: #709085;"></i>
                    <span class="h1 fw-bold mb-0">Furama</span>
                </div>

                <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

                    <form style="width: 23rem;" method="post" action="/employee">
                        <input type="hidden" name="actionUser" value="update">
                        <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Update Employee</h3>
                        <div class="form-outline mb-4">
                            <input type="text" name="employeeId" value="${tony.employeeId}" readonly class="form-control form-control-lg" />
                            <label class="form-label" >Id </label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="text" name="employeeName" value="${tony.employeeName}" class="form-control form-control-lg" />
                            <label class="form-label" >Name </label>
                        </div>


                        <div class="form-outline mb-4">
                            <input type="date" name="employeeDateOfBirth" value="${tony.employeeDateOfBirth}" class="form-control form-control-lg" />
                            <label class="form-label" >Date Of Birth </label>
                        </div>


                        <div class="form-outline mb-4">
                            <input type="text" name="employeeIdCard" value="${tony.employeeIdCard}" class="form-control form-control-lg" />
                            <label class="form-label" >Id Card</label>
                        </div>


                        <div class="form-outline mb-4">
                            <input type="text" name="employeeSalary"  value="${tony.employeeSalary}" class="form-control form-control-lg" />
                            <label class="form-label" >Salary </label>
                        </div>


                        <div class="form-outline mb-4">
                            <input type="text" name="employeePhoneNumber" value="${tony.employeePhoneNumber}" class="form-control form-control-lg" />
                            <label class="form-label" >Phone </label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="text" name="employeeEmail" value="${tony.employeeEmail}" class="form-control form-control-lg" />
                            <label class="form-label" >Email </label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="text" name="employeeAddress" value="${tony.employeeAddress}" class="form-control form-control-lg" />
                            <label class="form-label" >Address </label>
                        </div>

                        <div class="form-outline mb-4">
                            <select name="position">
                                <c:forEach items="${position}" var="pi">
                                    <c:choose>
                                        <c:when test="${pi.positionId == tony.position.positionId}">
                                            <option selected value="${pi.positionId}">${pi.positionName}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option  value="${pi.positionId}">${pi.positionName}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                            <label class="form-label" >Position </label>
                        </div>

                        <div class="form-outline mb-4">
                            <select name="education">
                                <c:forEach items="${education}" var="ed">
                                    <c:choose>
                                        <c:when test="${ed.educationDegreeId == tony.educationDegree.educationDegreeId}">
                                            <option selected value="${ed.educationDegreeId}">${ed.educationDegreeName}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option  value="${ed.educationDegreeId}">${ed.educationDegreeName}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                            <label class="form-label" >Education Degree </label>
                        </div>


                        <div class="form-outline mb-4">
                            <select name="division">
                                <c:forEach items="${division}" var="di">
                                    <c:choose>
                                        <c:when test="${di.divisionId == tony.division.divisionId}">
                                            <option selected value="${di.divisionId}">${di.divisionName}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option  value="${di.divisionId}">${di.divisionName}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                            <label class="form-label" >Division </label>
                        </div>

                        <div class="pt-1 mb-4">
                            <button class="btn btn-info btn-lg btn-block" type="submit">Update Customer</button>
                        </div>

                    </form>

                </div>

            </div>
            <div class="col-sm-6 px-0 d-none d-sm-block">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp" alt="Login image" class="w-100 vh-100" style="object-fit: cover; object-position: left;">
            </div>
        </div>
    </div>
</section>
</body>
</html>