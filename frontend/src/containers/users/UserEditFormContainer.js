import React, {Component} from 'react';
import UserEditForm from '../../components/users/UserEditForm';
import Request from '../../helpers/request';

class UserEditFormContainer extends Component {

  constructor(props){
    super(props);
      console.log(props);
    this.handleUserUpdate = this.handleUserUpdate.bind(this);
  }

  handleUserUpdate(updateUser){
    const request = new Request();
    request.patch('/api/users/' + this.props.user.id, updateUser).then(() => {
      window.location = '/'
    })
    // .then(res => res.json())
    // .then(dbUpdatedUser => this.onUserSelected(dbUser))
  }

  render(){
    return <UserEditForm user={this.props.user} handleUserUpdate={this.handleUserUpdate}/>
  }

}

export default UserEditFormContainer;
