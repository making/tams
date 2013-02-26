<div class="row">
  <div class="span12">
    <h2>New User</h2>
    <form:form action="${pageContext.request.contextPath}/user/create"
      modelAttribute="userCreateForm" class="form-horizontal">
      <div class="control-group">
        <form:label path="name" class="control-label">User Name</form:label>
        <div class="controls">
          ${f:h(userCreateForm.name)}
          <form:hidden path="name" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="email" class="control-label">E-mail</form:label>
        <div class="controls">
          ${f:h(userCreateForm.email)}
          <form:hidden path="email" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="birth" class="control-label">User Birth</form:label>
        <div class="controls">
          ${f:h(userCreateForm.birth)}
          <form:hidden path="birth" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="password" class="control-label">User Password</form:label>
        <div class="controls">
          ******
          <form:hidden path="password" />
        </div>
      </div>
      <div class="control-group">
        <form:label path="confirmPassword" class="control-label">User Password (Confirm)</form:label>
        <div class="controls">
          ******
          <form:hidden path="confirmPassword" />
        </div>
      </div>
      <div class="form-actions">
        <input type="submit" class="btn btn-primary" name="create"
          value="Create" /> <input type="submit" class="btn"
          name="form" value="Back to Form" />
      </div>
    </form:form>
  </div>
</div>
