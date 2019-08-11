import React from 'react';

const NewUserForm = (props) => {

  const handleSubmit = (event) => {
    event.preventDefault();
    const newUser = {
      "name": event.target.name.value,
      "alias": event.target.alias.value
    }
    props.handleNewUserPost(newUser);
  }

  return (
    <div className="new-user-form">
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder="Name" name="name" />
        <input type="text" placeholder="Alias" name="alias" />
        <button type="submit">Save</button>
      </form>
    </div>
  )

}

export default NewUserForm;
