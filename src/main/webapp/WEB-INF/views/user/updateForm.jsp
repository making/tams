<div class="row">
  <div class="span12">
    <h2>Update User</h2>
    <form:form action="${pageContext.request.contextPath}/user/update"
      modelAttribute="userUpdateForm" class="form-horizontal">
      <div class="control-group">
        <form:label path="id" class="control-label">User Id</form:label>
        <div class="controls">
          ${f:h(userUpdateForm.id)}
          <form:input path="id" type="hidden" />
          <form:errors path="id" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="name" class="control-label">User Name</form:label>
        <div class="controls">
          <form:input path="name" type="text" />
          <form:errors path="name" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="email" class="control-label">E-mail</form:label>
        <div class="controls">
          <form:input path="email" type="text" />
          <form:errors path="email" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="birth" class="control-label">User Birth</form:label>
        <div class="controls">
          <form:input path="birth" type="text" />
          <form:errors path="birth" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="password" class="control-label">User Password</form:label>
        <div class="controls">
          <form:input path="password" type="password" value="" />
          <form:errors path="password" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="confirmPassword" class="control-label">User Password (Confirm)</form:label>
        <div class="controls">
          <form:input path="confirmPassword" type="password" value="" />
          <form:errors path="confirmPassword" />
        </div>
      </div>
      <div class="form-actions">
        <form:hidden path="version" />
        <form:errors path="version" />
        <input type="submit" class="btn btn-primary" name="confirm"
          value="Confirm" /> <input type="submit" class="btn"
          name="redirectToList" value="Back to List" />
      </div>
    </form:form>
  </div>
</div>
