<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>HOME PAGE</h1>
	<form:form action="${pageContext.request.contextPath}/" method="post" modelAttribute="request">
		<label for="searchKey">Tìm kiếm theo :</label>
		<form:select id="searchKey" path="key">
			<c:forEach items="${object.get(0)}" var="key">
				<form:option value="${key}">${key}</form:option>
			</c:forEach>
		</form:select> 
		<form:input path="value" />
		<input type="submit">
	</form:form>

	<h1 id="size" style="visibility: hidden">${fn:length(object.get(1))}</h1>
	<div
		style="width: 500px; overflow-x: scroll; border: 2px solid; margin: 0 auto; display: none"
		id="view_data">
		<table border="1" style="border-collapse: collapse;">
			<thead>
				<tr>
					<th>orderNo</th>
					<th>instructionNo</th>
					<th>rebalanceNo</th>
					<th>baseDate</th>
					<th>portfolioCd</th>
					<th>assetCategoryCd</th>
					<th>assetCategoryName</th>
					<th>modelTypeCd</th>
					<th>modelTypeName</th>
					<th>portfolioStatus</th>
					<th>nyuShutsuAmount</th>
					<th>operationStartDate</th>
					<th>rebalanceTargetKbn</th>
					<th>assetClassCd</th>
					<th>assetClassName</th>
					<th>productCd</th>
					<th>productName</th>
					<th>sellBuyQuantity</th>
					<th>orderAmount</th>
					<th>instructionCreateDate</th>
					<th>sellBuyDate</th>
					<th>tradeDate</th>
					<th>deliveryDate</th>
					<th>sellBuyKbn</th>
					<th>executeKbn</th>
					<th>instructionStatus</th>
					<th>cashShort</th>
					<th>instructionError</th>
					<th>allocationRatioEstranged</th>
					<th>orderFile</th>
					<th>outInstructionFlg</th>
					<th>deleteFlg</th>
					<th>createDt</th>
					<th>createUserId</th>
					<th>updateDt</th>
					<th>updateUserId</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${object.get(1)}" var="order">
					<tr>
						<td>${order.orderNo}</td>
						<td>${order.instructionNo}</td>
						<td>${order.rebalanceNo}</td>
						<td>${order.baseDate}</td>
						<td>${order.portfolioCd}</td>
						<td>${order.assetCategoryCd}</td>
						<td>${order.assetCategoryName}</td>
						<td>${order.modelTypeCd}</td>
						<td>${order.modelTypeName}</td>
						<td>${order.portfolioStatus}</td>
						<td>${order.nyuShutsuAmount}</td>
						<td>${order.operationStartDate}</td>
						<td>${order.rebalanceTargetKbn}</td>
						<td>${order.assetClassCd}</td>
						<td>${order.assetClassName}</td>
						<td>${order.productCd}</td>
						<td>${order.productName}</td>
						<td>${order.sellBuyQuantity}</td>
						<td>${order.orderAmount}</td>
						<td>${order.instructionCreateDate}</td>
						<td>${order.sellBuyDate}</td>
						<td>${order.tradeDate}</td>
						<td>${order.deliveryDate}</td>
						<td>${order.sellBuyKbn}</td>
						<td>${order.executeKbn}</td>
						<td>${order.instructionStatus}</td>
						<td>${order.cashShort}</td>
						<td>${order.instructionError}</td>
						<td>${order.allocationRatioEstranged}</td>
						<td>${order.orderFile}</td>
						<td>${order.outInstructionFlg}</td>
						<td>${order.deleteFlg}</td>
						<td>${order.createDt}</td>
						<td>${order.createUserId}</td>
						<td>${order.updateDt}</td>
						<td>${order.updateUserId}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
<script type="text/javascript">
	window.onload = () => {
		 var orders = document.getElementById("size").textContent;
	        console.log(orders);
		if(orders=="0"){
			document.getElementById("view_data").style.display ="none";
		}
		else{
			document.getElementById("view_data").style.display ="block";
		}
	}
	
</script>

