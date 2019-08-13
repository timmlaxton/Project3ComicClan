import React from 'react';
import {Link} from 'react-router-dom';

const UserPage = (props) => {

  return (
    <div className="user-page">
      <h1>Hey, {props.user.alias}!</h1>
      <h1>What would you like do?</h1>
      <div className="user-choices">
        <Link to={'/comics'}><h1>Comics</h1></Link>
      </div>
      <div className="user-choices">
        <Link to={'/characters'}><h1>Characters</h1></Link>
      </div>
      <div className="user-choices">
        <Link to={'/publishers'}><h1>Publishers</h1></Link>
      </div>
    </div>
  )

}

export default UserPage;
