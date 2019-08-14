import React from 'react';

const UserEditForm = (props) => {

  console.log(props);

  const handleSubmit = (event) => {
    event.preventDefault();
    const updateUser = {
      "name": event.target.name.value,
      "alias": event.target.alias.value,
      "comics": null,
      "reviews": null
    }
    console.log(updateUser);
    props.handleUserUpdate(updateUser);

  }

  return (
    <div className="new-user-form">
      <form onSubmit={handleSubmit}>
        <input type="text" name="name" defaultValue={props.user.name}/>
        <input type="text" name="alias" defaultValue={props.user.alias}/>
        <button type="submit">Save</button>
      </form>
    </div>
  )

}

export default UserEditForm;
