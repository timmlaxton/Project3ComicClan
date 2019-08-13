import React from 'react';

const NewUserForm = (props) => {

  const handleSubmit = (event) => {
    event.preventDefault();
    const newUser = {
      "name": event.target.name.value,
      "alias": event.target.alias.value,
      "comics": null,
      "reviews": null
    }
    console.log(newUser);
    props.handleNewUserPost(newUser);
  }

  return (
    <div className="new-user-form">
    <h2>New user? Register now:</h2>
    <br/>
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder="Name" name="name" />
        <input type="text" placeholder="Alias" name="alias" />
        <button type="submit">Register!</button>
      </form>
    </div>
  )

}

export default NewUserForm;
